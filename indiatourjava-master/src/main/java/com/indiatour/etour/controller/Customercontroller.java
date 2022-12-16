package com.indiatour.etour.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indiatour.etour.modal.Customer;
import com.indiatour.etour.modal.ERole;
import com.indiatour.etour.modal.LoginRespons;
import com.indiatour.etour.modal.Role;
import com.indiatour.etour.payload.request.LoginRequest;
import com.indiatour.etour.payload.request.SignupRequest;
import com.indiatour.etour.payload.response.MessageResponse;
import com.indiatour.etour.repository.Customerrepo;
import com.indiatour.etour.repository.RoleRepository;
import com.indiatour.etour.services.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class Customercontroller {
	

	@Autowired
	Customerrepo userRepository;
	
	@Autowired
	RoleRepository roleRepository;

	
	@Autowired
	CustomerService custservice;
	

	//for checking
	@GetMapping(value = "/customers") 
	 public List<Customer> showCustomers()
	 {
		List<Customer> cus=userRepository.findAll();
		  return cus;
	 }
	
	//get customer by customer id
	@GetMapping(value = "/customer/{cid}")  
	 public List<Customer> showCustomersbyid(@PathVariable int cid)
	 {
		  return custservice.getcustomerbyid(cid);
	 }
	

	//for login
		@PostMapping("/login")
		  public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
			
			userRepository.authentication(loginRequest.getEmail(), loginRequest.getPassword());
			
			Customer customer=userRepository.
					authentication(loginRequest.getEmail(), loginRequest.getPassword());
			
			if(customer!=null) {
				
				LoginRespons response = new LoginRespons();
	
				response.setAccessToken(true);
				response.setCust_Id(customer.getCust_Id());
				response.setEmail(customer.getEmail());
				response.setPassword(customer.getPassword());

//				response.setRoles(customer.getRoles());
				Set<Role> role=customer.getRoles();
				Iterator<Role> value = role.iterator();
				
				if(value.hasNext())
				{
					String roles=(value.next()).getName().toString();
					response.setRoles(roles);
				}
				
						
			    return ResponseEntity.ok(response);
			}
			else {
				 return ResponseEntity
				          .badRequest()
				          .body(new MessageResponse("Error: Bad Credentials"));
			}

		  }
	
	
	//for signup
	@PostMapping("/signup")
	  public ResponseEntity<?> registerUser(@RequestBody SignupRequest  signUpRequest) {
	    if (userRepository.existsByMobile(signUpRequest.getMobile())) {
	      return ResponseEntity
	          .badRequest()
	          .body(new MessageResponse("Error: Mobile Number is already taken!"));
	    }

	    if (userRepository.existsByEmail(signUpRequest.getEmail())) {
	      return ResponseEntity
	          .badRequest()
	          .body(new MessageResponse("Error: Email is already in use!"));
	    }

	    // Create new user's account

	    Customer user = new Customer(signUpRequest.getFirstname(),signUpRequest.getLastname(),
	    		signUpRequest.getEmail(),signUpRequest.getPassword(),signUpRequest.getGender(),signUpRequest.getMobile(),signUpRequest.getDob()
	    		);

	   
	    Set<String> strRoles = signUpRequest.getRole();
	    Set<Role> roles = new HashSet<>();

	    if (strRoles == null) {
	      Role userRole = roleRepository.findByName(ERole.ROLE_USER)
	          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
	      roles.add(userRole);
	    } else {
	      strRoles.forEach(role -> {
	        switch (role) {
	        case "admin":
	          Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
	              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
	          roles.add(adminRole);

	          break;
	        default:
	          Role userRole = roleRepository.findByName(ERole.ROLE_USER)
	              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
	          roles.add(userRole);
	        }
	      });
	    }
	    user.setRoles(roles);
	    userRepository.save(user);

	    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	    
	}	
}
