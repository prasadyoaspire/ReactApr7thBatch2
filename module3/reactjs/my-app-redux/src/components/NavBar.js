import React from 'react';
import { Link } from 'react-router-dom';

function NavBar() {

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
                <li className="nav-item">
                    <Link className="nav-link" to="/customer/login">SignIn</Link>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="#">SingUp</Link>
                </li>
            </ul>
        </nav>
    )
}

export default NavBar;