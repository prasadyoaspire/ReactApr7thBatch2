import React, { useEffect, useState } from 'react';
import Axios from 'axios';
import { Link } from 'react-router-dom';
import img1 from '../images/samsungm12.jpg';
import SearchProduct from './SearchProduct';


function FetchAllProductsTwo() {

    const [products, setProducts] = useState([]);

    const fetchAllProducts = () => {
        Axios.get("http://localhost:8081/product/all").then(resp => setProducts(resp.data));
    }

    //similar to componentDidMount and componentDidUpdate
    useEffect(fetchAllProducts, []);

    return (
        <div>
            {/* <SearchProduct/> */}
            <div class="row">
                {
                    products.map((p, index) =>
                        <div key={index} className="col-sm-3">
                            <Link to={`/product/get/${p.productId}`}>
                                <div className="card" style={{ width: "200px", height: "400px" }}>
                                    <img className="card-img-top" src={img1} alt="Card image" />
                                    <div className="card-body">
                                        <h4 className="card-title">{p.productName}</h4>
                                        <p className="card-text">{p.productPrice}</p>
                                    </div>
                                </div>
                            </Link>
                        </div>
                    )
                }
            </div>
        </div>
    )
}

export default FetchAllProductsTwo;