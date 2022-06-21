import React, { useEffect, useState } from 'react';
import {Link,useNavigate} from 'react-router-dom';
import { useDispatch, useSelector } from 'react-redux';

function NavBar() {

    const loggedInUser = useSelector(state => state.authenticationReducer.loggedInUser)
    const [loggedIn,setLoggedIn] = useState(false);   
    const navigate = useNavigate();

    useEffect(()=> {
       const myUser = localStorage.getItem("myUser");
       console.log("effect called")
       if(myUser!==null) {
        setLoggedIn(true);
       }
    })

    const goToLogin = () => {
       return navigate('/customer/login')
    }

    const doLogout = () => {
        const myUser = localStorage.getItem("myUser");
        if(myUser!==null) {
            localStorage.removeItem("myUser");
            setLoggedIn(false)
            alert("You have logged out succssfully!");
            navigate('/')
        }
    }

    return (
        <nav className="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
            <Link className="navbar-brand" to="#">Logo</Link>
            <ul className="navbar-nav">
                <li className="nav-item">
                    <Link className="nav-link" to="/product/save">Add Product</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="#">AboutUs</Link>
                </li>
                {
                    loggedIn ?
                        <li className="nav-item">
                            {/* <Link className="nav-link" to="/customer/logout">Logout</Link> */}
                            <button onClick={doLogout}>Logout</button>
                        </li>
                        :
                        <li className="nav-item">
                            {/* <Link className="nav-link" to="/customer/login">SignIn</Link> */}
                            <button onClick={goToLogin}>Signin</button>
                        </li>
                }

                <li className="nav-item">
                    <Link className="nav-link" to="#">SingUp</Link>
                </li>
            </ul>
        </nav>
    )
}

export default NavBar;