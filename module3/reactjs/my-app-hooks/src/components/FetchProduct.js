import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import { useParams } from 'react-router-dom';
import img1 from '../images/samsungm12.jpg';

function FetchProduct() {

    const [product, setProduct] = useState(null);

    const { id } = useParams();

    const fetchProductById = () => {
        axios.get("http://localhost:8081/product/find/" + id).then(resp => setProduct(resp.data));
    }

    useEffect(fetchProductById, [id]);

    return (
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
            <div>
                <Link to="/product/all" className="btn btn-secondary">Back</Link>
            </div>
        </div>
    )
}

export default FetchProduct;