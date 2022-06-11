import React from 'react';

class Register extends React.Component {

    constructor() {
        super();
        this.state = {
            firstName: "",
            lastName : ""
        }
        this.handleChange = this.handleChange.bind(this);      
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {        
        this.setState({
            [event.target.name]: event.target.value
        })
    } 

    handleSubmit() {
        console.log("Hello: " + this.state.firstName+ "  "+this.state.lastName);
    }

    render() {
        return (
            <div>
                <h2>Registration Form</h2>
                <label>
                    FirstName:
                    <input type="text" name="firstName" value={this.state.firstName} onChange={this.handleChange} />
                </label>
                <label>
                    LastName:
                    <input type="text" name="lastName" value={this.state.lastName} onChange={this.handleChange} />
                </label>
                <button onClick={this.handleSubmit}>Submit</button>
            </div>
        )
    }
}

export default Register;