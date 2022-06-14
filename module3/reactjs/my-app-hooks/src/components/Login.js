import React, { useState } from 'react';
import Axios from 'axios';
import { Link } from 'react-router-dom';


function Login() {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const doLogin = () => {
        alert("login submitted");
    }

    return (
        <div className="container">

            <div className="form-group">
                <label htmlFor='username'>Username</label>
                <input type="text" className="form-control" name="username" value={username} onChange={e => setUsername(e.target.value)} />

            </div>
            <div className="form-group">
                <label htmlFor='password'>Password</label>
                <input type="password" className="form-control" name="password" value={password} onChange={e => setPassword(e.target.value)} />

            </div>

            <div>
                <button onClick={doLogin} className="btn btn-primary">Login</button>
            </div>
        </div>
    )
}

export default Login;