import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { useDispatch, useSelector } from 'react-redux';
import {addProduct} from '../store/actions/ProductActions'

function CreateProduct() {

    const [pName, setPName] = useState("");
    const [pPrice, setPPrice] = useState("");
    const [pCategory, setPCategory] = useState("");

    const [formErrors, setFormErrors] = useState({});

    const newProduct = useSelector(state=>state.productReducer.newProduct)

    const dispatch = useDispatch();

    const navigate = useNavigate();

    const handleSubmit = () => {

        //validate form data
        let errors = {};

        if(!pName) {
            errors['productNameError'] = "Product Name is required";
        }
        if(!pPrice) {
            errors['productPriceError'] = "Product Price is required";
            
        } else if(pPrice <=0) {
            errors['productPriceError'] = "Product Price should not be negative.";
        }
        if(!pCategory) {
            errors['productCategoryError'] = "Product Category is required";
        }

        setFormErrors(errors);

        const noErrors = Object.keys(errors).length === 0;

        //if data is valid dispatch the request to middelware
        if(noErrors) {
            console.log("Valid form data");
            
            const payload = {
                productName: pName,
                productPrice: pPrice,
                category: pCategory
            }    
            dispatch(addProduct(payload));
        }  
     
    }

    return (
        <div className="container">
            <h2 style={{ backgroundColor: "lightblue" }}>Product Form</h2>
            <div className="form-group">
                <label htmlFor='pName'>ProductName</label>
                <input type="text" className="form-control" name="pName" value={pName} onChange={e => setPName(e.target.value)} />
                {
                   formErrors.productNameError &&
                   <div style={{color:'red'}}>{formErrors.productNameError}</div> 
                }
            </div>
            <div className="form-group">
                <label htmlFor='pPrice'>ProductPrice </label>
                <input type="text" className="form-control" name="pPrice" value={pPrice} onChange={e => setPPrice(e.target.value)} />
                {
                   formErrors.productPriceError &&
                   <div style={{color:'red'}}>{formErrors.productPriceError}</div> 
                }
            </div>
            <div className="form-group">
                <label htmlFor='pCategory'>Category</label>
                <input type="text" className="form-control" name="pCategory" value={pCategory} onChange={e => setPCategory(e.target.value)} />
                {
                   formErrors.productCategoryError &&
                   <div style={{color:'red'}}>{formErrors.productCategoryError}</div> 
                }
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