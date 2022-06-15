import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { useDispatch, useSelector } from 'react-redux';
import { getAllProducts } from '../store/actions/ProductActions';


function FetchAllProducts() {

    const products = useSelector(state=>state.productReducer.products)
    const dispatch = useDispatch();

    const myFunction = async () => {
        dispatch(getAllProducts()) 
    };
   
    useEffect(()=> {
        myFunction();
    },[]);

    return (
        <div>
            {/* <SearchProduct/> */}
            <div class="row">
                {
                    products.map((p, index) =>
                        <div key={index} className="col-sm-3">
                            {/* <Link to={`/product/get/${p.productId}`}> */}
                                <div className="card" style={{ width: "200px", height: "400px" }}>
                                    {/* <img className="card-img-top" src={img1} alt="Card image" /> */}
                                    <div className="card-body">
                                        <h4 className="card-title">{p.productName}</h4>
                                        <p className="card-text">{p.productPrice}</p>
                                    </div>
                                </div>
                            {/* </Link> */}
                        </div>
                    )
                }
            </div>
        </div>
    )
}

export default FetchAllProducts;