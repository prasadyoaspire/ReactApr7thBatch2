import React, { useState } from 'react';
import Axios from 'axios';
import { Link } from 'react-router-dom';

function CreateProduct() {

    const [pName, setPName] = useState("");
    const [pPrice, setPPrice] = useState("");
    const [pCategory, setPCategory] = useState("");

    const handleSubmit = () => {
        const payload = {
            productName: pName,
            productPrice: pPrice,
            category: pCategory
        }
        Axios.post("http://localhost:8081/product/save", payload).then(resp =>
            alert("Product saved with id:" + resp.data.productId));
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
                <Link to="/" className="btn btn-secondary">BackToHome</Link>
            </div>
        </div>

    )
}

export default CreateProduct;