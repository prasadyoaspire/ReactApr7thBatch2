import React, { useEffect, useState } from 'react';
import Axios from 'axios';

function FetchAllProductsTwo() {

    const [products,setProducts] = useState([]);

    const fetchAllProducts = () => {
        Axios.get("http://localhost:8081/product/all").then(resp =>setProducts(resp.data));
    }

    //similar to componentDidMount and componentDidUpdate
    useEffect(fetchAllProducts,[]);

    return(
        <div>
              <h2>All Products (using Hooks)</h2>
                {
                    products.length > 0 ?

                        <table border="1">
                            <tr>
                                <th>ProductId</th>
                                <th>Name</th>
                                <th>Price</th>
                                <th>Category</th>
                            </tr>
                            {
                                products.map((p, index) =>
                                    <tr key={index}>
                                        <td>{p.productId}</td>
                                        <td>{p.productName}</td>
                                        <td>{p.productPrice}</td>
                                        <td>{p.category}</td>
                                    </tr>
                                )
                            }
                        </table>
                        : <h3>No Products Available</h3>
                }
        </div>
    )
}

export default FetchAllProductsTwo;