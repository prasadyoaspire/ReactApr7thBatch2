const initialState = {
    products: [],
    product : null,
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
    
    else {
        return state;
    }
}


