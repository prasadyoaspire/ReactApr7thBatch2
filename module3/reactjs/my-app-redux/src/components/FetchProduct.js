import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import { useParams } from 'react-router-dom';
import { useDispatch, useSelector } from 'react-redux';
import img1 from '../images/samsungm12.jpg';
import { getProductDetails } from '../store/actions/ProductActions';


function FetchProduct() {

    // const [product, setProduct] = useState(null);
    const product = useSelector(state => state.productReducer.product)

    const { id } = useParams();

    const dispatch = useDispatch();

    const fetchProductById = () => {
        dispatch(getProductDetails(id));
    }

    useEffect(fetchProductById, [id]);
    
    return (
        <div className='contrainer-fluid'>
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
                        <Link to={`/product/edit/${product.productId}`} className="btn btn-secondary">Edit</Link> &nbsp;&nbsp;
                        <Link to={`/product/delete/${product.productId}`} className="btn btn-secondary">Delete</Link><br></br><br></br>
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