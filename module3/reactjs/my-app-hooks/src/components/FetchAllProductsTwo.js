import React, { useEffect, useState } from 'react';
import Axios from 'axios';
import { Link } from 'react-router-dom';


function FetchAllProductsTwo() {

    const [products, setProducts] = useState([]);

    const fetchAllProducts = () => {
        Axios.get("http://localhost:8081/product/all").then(resp => setProducts(resp.data));
    }

    //similar to componentDidMount and componentDidUpdate
    useEffect(fetchAllProducts, []);

    return (
        <div>
            <h2>All Products (using Hooks)</h2>
            {
                products.length > 0 ?

                    <table border="1">
                        <tr>
                           
                            <th>Name</th>
                            <th>Price</th>
                            <th>View</th>
                            <th>Edit</th>
                            <th>delete</th>
                        </tr>
                        {
                            products.map((p, index) =>
                                <tr key={index}>
                                   
                                    <td>{p.productName}</td>
                                    <td>{p.productPrice}</td>
                                  
                                    <td><Link to={`/product/get/${p.productId}`}>View</Link></td>
                                    <td><Link to="">Edit</Link></td>
                                    <td><Link to={`/product/delete/${p.productId}`}>Delete</Link></td>
                                </tr>
                            )
                        }
                    </table>
                    : <h3>No Products Available</h3>
            }
            <div>
                <Link to="/">Back To Home</Link>
            </div>
        </div>

      
    )
}

export default FetchAllProductsTwo;