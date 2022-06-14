import React, { useState } from 'react';
import { useSearchParams } from 'react-router-dom';
import axios from 'axios';
import { Link } from 'react-router-dom';
import img1 from '../images/samsungm12.jpg'

function SearchProduct() {

    const [product, setProduct] = useState(null);
    let [searchParams] = useSearchParams();

    let productId = searchParams.get("productId");

    const handleSubmit = () => {
        axios.get("http://localhost:8081/product/find/" + productId).then(resp => setProduct(resp.data));
    }

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label>
                    <input type="text" name="productId" />
                </label>
                <button type="submit" className="btn btn-primary">Search</button>
            </form>
            <div>
                {
                    product !== null &&
                    <div className="row">
                        <div className="col">
                            <img src={img1} alt="Card image" />
                        </div>
                        <div className="col">
                            <h2>Product Details</h2>
                            <p>ProductId : {product.productId}</p>
                            <p>Name : {product.productName}</p>
                            <p>Price : {product.productPrice}</p>
                            <p>Category : {product.category}</p>
                        </div>
                    </div>
                }
            </div>
        </div>
    )
}

export default SearchProduct;