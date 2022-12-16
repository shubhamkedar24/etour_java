import axios from "axios";
import { useNavigate } from "react-router-dom"


const API_URL = "http://localhost:8080/api/auth/";


class AuthService {
  login(email, password) {
    return axios
      .post(API_URL + "login", {
        email,
        password
      })
      .then(response => {
        if (response.data.accessToken) {
          localStorage.setItem("user", JSON.stringify(response.data));
        }
        return response.data;
      });
  }

  logout() {
    localStorage.removeItem("user");
  }

  register(firstname, lastname, email, mobile, dob, gender, password) {
    return axios.post(API_URL + "signup", {
      firstname,
      lastname,
      email,
      mobile,
      dob,
      gender,
      password
    });
  }

  getCurrentUser() {
    return JSON.parse(localStorage.getItem('user'));;
  }
}

export default new AuthService();
