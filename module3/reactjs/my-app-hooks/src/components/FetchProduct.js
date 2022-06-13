import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';

function FetchProduct() {

    const [product, setProduct] = useState(null);

    const {id} = useParams();

    const fetchProductById = () => {
       axios.get("http://localhost:8081/product/find/"+id).then(resp=>setProduct(resp.data));
    }

    useEffect(fetchProductById,[id]);

    return(
        <div>
            <h2>Product Details</h2>
            {
                product !== null &&
                <div> 
                    <p>ProductId : {product.productId}</p>
                    <p>Name : {product.productName}</p>
                    <p>Price : {product.productPrice}</p>
                    <p>Category : {product.category}</p>
                </div>
            }
        </div>
    )
}

export default FetchProduct;