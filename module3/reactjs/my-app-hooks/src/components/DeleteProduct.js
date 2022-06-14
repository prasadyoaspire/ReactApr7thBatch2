import React,{useState,useEffect} from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';

function DeleteProduct() {

    const [product, setProduct] = useState(null);

    const {id} = useParams();
   
    const fetchProductById = () => {
       axios.get("http://localhost:8081/product/find/"+id).then(resp=>setProduct(resp.data));
    }

    useEffect(fetchProductById,[id]);

    const deleteProduct = () => {
        axios.delete("http://localhost:8081/product/delete/"+id).then(resp=>alert("Product deleted."));                
    }

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

            <button onClick={deleteProduct}>Delete</button>
        </div>
    )
}

export default DeleteProduct;