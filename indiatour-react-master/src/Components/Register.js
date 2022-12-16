import React, { Component } from "react";
import Form from "react-validation/build/form";
import Input from "react-validation/build/input";
import CheckButton from "react-validation/build/button";
import { isEmail } from "validator";
import './Login.css'
import AuthService from "../Services/auth.service";

const required = value => {
  if (!value) {
    return (
      <div className="alert alert-danger" role="alert">
        This field is required!
      </div>
    );
  }
};

const email = value => {
  if (!isEmail(value)) {
    return (
      <div className="alert alert-danger" role="alert">
        This is not a valid email.
      </div>
    );
  }
};


const vpassword = value => {
  if (value.length < 6 || value.length > 40) {
    return (
      <div className="alert alert-danger" role="alert">
        The password must be between 6 and 40 characters.
      </div>
    );
  }
};

class Register extends Component {
  constructor(props) {
    super(props);
    this.handleRegister = this.handleRegister.bind(this);
    this.onChangefirstname = this.onChangefirstname.bind(this);
    this.onChangelastname = this.onChangelastname.bind(this);
    this.onChangegender = this.onChangegender.bind(this);
    this.onChangedob = this.onChangedob.bind(this);
    this.onChangemobile = this.onChangemobile.bind(this);
    this.onChangeEmail = this.onChangeEmail.bind(this);
    this.onChangePassword = this.onChangePassword.bind(this);

    this.state = {
      firstname: "",
      lastname: "",
      gender: "",
      dob: "",
      mobile: "",
      email: "",
      password: "",
      // comfirmpassword: "",
      successful: false,
      message: ""
    };
  }

  onChangefirstname(e) {
    this.setState({
      firstname: e.target.value
    });
  }
  onChangelastname(e) {
    this.setState({
      lastname: e.target.value
    });
  }
  onChangegender(e) {
    this.setState({
      gender: e.target.value
    });
  }
  onChangedob(e) {
    this.setState({
      dob: e.target.value
    });
  }

  onChangemobile(e) {
    this.setState({
      mobile: e.target.value
    });
  }

  onChangeEmail(e) {
    this.setState({
      email: e.target.value
    });
  }

  onChangePassword(e) {
    this.setState({
      password: e.target.value
    });
  }

  handleRegister(e) {
    e.preventDefault();

    this.setState({
      message: "",
      successful: false
    });

    this.form.validateAll();

    if (this.checkBtn.context._errors.length === 0) {
      AuthService.register(
        this.state.firstname,
        this.state.lastname,
        this.state.email,
        this.state.mobile,
        this.state.dob,
        this.state.gender,
        this.state.password,
      ).then(
        response => {
          this.setState({
            message: response.data.message,
            successful: true
          });
        },
        error => {
          const resMessage =
            (error.response &&
              error.response.data &&
              error.response.data.message) ||
            error.message ||
            error.toString();

          this.setState({
            successful: false,
            message: resMessage
          });
        }
      );
    }
  }

  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-6">
            <img
              src="/Images/giphy.gif"
              alt="profile-img"
              className="img-fluid"

            />
          </div>
          <div className="col-6">
            <img
              src="/Images/logo5.png"
              alt="profile-img"
              className="cprofile-img-card img-fluid"
            />
          <h3 className="text-center text-color:#232062">tripiFy</h3>
            <Form
              onSubmit={this.handleRegister}
              ref={c => {
                this.form = c;
              }}
            >
              {!this.state.successful && (
                <div>
                  <div className="row">
                    <div className="form-group text-black col-6">
                      <label htmlFor="firstname">First Name</label>
                      <Input
                        type="text"
                        className="form-control"
                        name="firstname"
                        value={this.state.firstname}
                        onChange={this.onChangefirstname}
                        validations={[required]}
                      />
                    </div>
                    <div className="form-group text-black col-6">
                      <label htmlFor="lastname">Last Name</label>
                      <Input
                        type="text"
                        className="form-control"
                        name="lastname"
                        value={this.state.lastname}
                        onChange={this.onChangelastname}
                        validations={[required]}
                      />
                    </div>
                  </div>

                  <div className="row">
                    <div className="form-group col-6">
                      <label htmlFor="email">Email</label>
                      <Input
                        type="text"
                        className="form-control"
                        name="email"
                        value={this.state.email}
                        onChange={this.onChangeEmail}
                        validations={[required, email]}
                      />
                    </div>
                    <div className="form-group col-12">
                      <label htmlFor="mobile">Mobile No.</label>
                      <Input
                        type="text"
                        className="form-control"
                        name="mobile"
                        value={this.state.mobile}
                        onChange={this.onChangemobile}
                        validations={[required]}
                        pattern="[0-9]{10}"
                      />
                    </div>


                  </div>
                  <div className="row">
                    <div className="form-group col-6">
                      <label htmlFor="dob">Date of Birth</label>
                      <Input
                        type="date"
                        className="form-control"
                        name="dob"
                        value={this.state.dob}
                        onChange={this.onChangedob}
                        validations={[required]}
                        min="1947-01-01"
                        max="2005-03-31"
                      />
                    </div>
                    <div className="form-group col-6">
                      <div>
                        <label htmlFor="gender">Gender</label>

                        <div class="form-check form-check-inline">
                          <input class="form-check-input mt-3" type="radio" name="gender" value="Male" id="inlineRadio1" onChange={this.onChangegender}
                            validations={[required]} />
                          <label class="form-check-label" for="inlineRadio1">Male</label>
                        </div>
                        <div class="form-check form-check-inline">
                          <input class="form-check-input mt-3" type="radio" name="gender" value="Female" id="inlineRadio2" onChange={this.onChangegender}
                            validations={[required]} />
                          <label class="form-check-label" for="inlineRadio2">Female</label>
                        </div>
                        <div class="form-check form-check-inline">
                          <input class="form-check-input mt-3" type="radio" name="gender" value="others" id="inlineRadio3" onChange={this.onChangegender}
                            validations={[required]} />
                          <label class="form-check-label" for="inlineRadio3">Others</label>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div className="row">
                    <div className="form-group col-6">
                      <label htmlFor="password">Password</label>
                      <Input
                        type="password"
                        className="form-control"
                        name="password"
                        id="password"
                        value={this.state.password}
                        onChange={this.onChangePassword}
                        validations={[required, vpassword]}
                      />
                    </div>
                    {/* <div className="form-group col-6">
                      <label htmlFor="comfirmpassword">Comfirm Password</label>
                      <Input
                        type="password"
                        className="form-control"
                        name="comfirmpassword"
                        id="comfirm_password"
                        value={this.state.comfirmpassword}
                        validations={[required]}
                        onkeyup={this.check}
                      />
                    </div> */}
                  </div>
                  <div className="form-group text-center">
                    <button className="btn btn-secondary btn-block mt-4 mb-4">Sign Up</button>
                  </div>
                </div>
              )}

              {this.state.message && (
                <div className="form-group">
                  <div
                    className={
                      this.state.successful
                        ? "alert alert-success"
                        : "alert alert-danger"
                    }
                    role="alert"
                  >
                    {this.state.message}
                  </div>
                </div>
              )}
              <CheckButton
                style={{ display: "none" }}
                ref={c => {
                  this.checkBtn = c;
                }}
              />
            </Form>
          </div>
        </div>
      </div>

    );
  }
}

export default Register;