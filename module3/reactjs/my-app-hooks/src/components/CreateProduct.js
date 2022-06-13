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
        <div>
            <div>
                <label>
                    ProductName:
                    <input type="text" name="pName" value={pName} onChange={e=> setPName(e.target.value)} />
                </label>
            </div>
            <div>
                <label>
                    ProductPrice:
                    <input type="text" name="pPrice" value={pPrice} onChange={e=>setPPrice(e.target.value)} />
                </label>
            </div>
            <div>
                <label>
                    Category:
                    <input type="text" name="pCategory" value={pCategory} onChange={e=>setPCategory(e.target.value)} />
                </label>
            </div>
            <button onClick={handleSubmit}>Submit</button>

            <div>
                <Link to="/">Back To Home</Link>
            </div>
        </div>
        
    )
}

export default CreateProduct;