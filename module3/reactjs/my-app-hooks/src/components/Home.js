import React from 'react';
import { Link } from 'react-router-dom';

function Home() {

    return(
        <div>
            <h2>Welcome to MyStore</h2>

            <Link to="/countertwo">display counter</Link> <br></br>

            <Link to="/product/all">Display All Products</Link> <br></br>

            <Link to="/product/save">Add Product</Link>

        </div>
    )
}

export default Home;