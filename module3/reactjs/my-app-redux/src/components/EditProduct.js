import React, { useState } from 'react';
import {useDispatch,useSelector } from 'react-redux';
import { useNavigate } from 'react-router-dom';
import { updateProduct } from '../store/actions/ProductActions';

function EditProduct() {

    const product = useSelector(state => state.productReducer.product);
    const navigate = useNavigate();
    const dispatch = useDispatch();

    const [pId, setPId] = useState(product.productId);
    const [pName, setPName] = useState(product.productName);
    const [pPrice, setPPrice] = useState(product.productPrice);
    const [pCategory, setPCategory] = useState(product.category);

    const handleSubmit = () => {

        const payload = {
            productId : pId,
            productName: pName,
            productPrice: pPrice,
            category: pCategory
        }

        dispatch(updateProduct(payload));
        alert("Product Updated.");
        navigate(-1);
    }

    return (
        <div>
            <div className="container">
                <div className="form-group">
                    <label htmlFor='pName'>ProductId</label>
                    <input type="text" className="form-control" name="pId" value={pId} disabled />

                </div>
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
                    <button onClick={handleSubmit} className="btn btn-primary">Update</button>
                </div>
                <div style={{ float: "right" }}>
                    {/* <Link to="/" className="btn btn-secondary">BackToHome</Link> */}
                    <button onClick={() => navigate(-1)} className="btn btn-secondary">Go Back Home</button>
                </div>
            </div>
        </div>
    )
}

export default EditProduct;