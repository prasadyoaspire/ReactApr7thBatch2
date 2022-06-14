import React from 'react';
import { Link } from 'react-router-dom';
import FetchAllProductsTwo from './FetchAllProductsTwo';

function Home() {

    return (
        <div>
            <h2>Welcome to MyStore</h2>

            <FetchAllProductsTwo />

            {/* <Link to="/product/save">Add Product</Link> */}

        </div>
    )
}

export default Home;