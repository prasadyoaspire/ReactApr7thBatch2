const initialState = {
    products: [],
    product : null,
    newProduct : null,
    updateProduct : null
}

export default function productReducer(state = initialState, action) {

    if (action.type === 'PRODUCT/FETCHALL') {
        console.log(action.payload);
        return ({
            ...state,
            products: action.payload
        })
    }
    if (action.type === 'PRODUCT/FETCHBYID') {
        console.log(action.payload);
        return ({
            ...state,
            product: action.payload
        })
    }
    if (action.type === 'PRODUCT/ADDSUCCESS') {
        console.log(action.payload);
        return ({
            ...state,
            newProduct: action.payload
        })
    }
    if (action.type === 'PRODUCT/UPDATESUCCESS') {
        console.log(action.payload);
        return ({
            ...state,
            updateProduct: action.payload
        })
    }
    
    else {
        return state;
    }
}


