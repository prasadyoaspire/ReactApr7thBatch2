import React, { useState } from 'react';
import Axios from 'axios';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
import { useDispatch, useSelector } from 'react-redux';
import {addProduct} from '../actions/ProductActions'

function CreateProduct() {

    const [pName, setPName] = useState("");
    const [pPrice, setPPrice] = useState("");
    const [pCategory, setPCategory] = useState("");

    const newProduct = useSelector(state=>state.productReducer.newProduct)

    const dispatch = useDispatch();

    const navigate = useNavigate();

    const handleSubmit = () => {
        const payload = {
            productName: pName,
            productPrice: pPrice,
            category: pCategory
        }

        dispatch(addProduct(payload));

        alert("Product saved");
     
    }

    return (
        <div className="container">
            <h2 style={{ backgroundColor: "lightblue" }}>Product Form</h2>
            <div className="form-group">
                <label htmlFor='pName'>ProductName</label>
                <input type="text" className="form-control" name="pName" value={pName} onChange={e => setPName(e.target.value)} />

            </div>
            <div className="form-group">
                <label htmlFor='pPrice'>ProductPrice </label>
                <input type="text" className="form-control" name="pPrice" value={pPrice} onChange={e => setPPrice(e.target.value)} />

            </div>
            <div className="form-group">
                <label htmlFor='pCategory'>Category</label>
                <input type="text" className="form-control" name="pCategory" value={pCategory} onChange={e => setPCategory(e.target.value)} />

            </div>
            <div>
                <button onClick={handleSubmit} className="btn btn-primary">Submit</button>
            </div>
            <div style={{ float: "right" }}>
                {/* <Link to="/" className="btn btn-secondary">BackToHome</Link> */}
                <button onClick={()=>navigate(-1)} className="btn btn-secondary">Go Back Home</button>
            </div>
        </div>

    )
}

export default CreateProduct;