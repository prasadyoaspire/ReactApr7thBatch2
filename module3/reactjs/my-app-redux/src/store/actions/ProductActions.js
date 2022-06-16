import axios from "axios"

export function getAllProducts() {
    return (dispatch) => {
        return axios.get("http://localhost:8081/product/all").then(
            resp => {
                dispatch(getAllProductSuccess(resp.data));
            }
        )       
    }
}

export function getAllProductSuccess(data) {
    return {
        type: "PRODUCT/FETCHALL",
        payload: data
    }
}

export function getProductDetails(id) {
    return (dispatch) => {
        return axios.get("http://localhost:8081/product/find/" + id).then(resp => {
            console.log(resp.status);
            dispatch(getProductByIdSuccess(resp.data))
        })
    }
}

export function getProductByIdSuccess(data) {
    return {
        type: "PRODUCT/FETCHBYID",
        payload: data
    }
}

export function addProduct(product) {

    return (dispatch) => {
        return axios.post("http://localhost:8081/product/save", product).then(
            resp => {
                dispatch(addProductSuccess(resp.data));
            }
        )       
    }
}

export function addProductSuccess(data) {
    return {
        type: 'PRODUCT/ADDSUCCESS',
        payload: data
    }
}

export function updateProduct(product) {

    return (dispatch) => {
        return axios.put("http://localhost:8081/product/update", product).then(
            resp => {
                dispatch(updateProductSuccess(resp.data));
            }
        )       
    }
}

export function updateProductSuccess(data) {
    return {
        type: 'PRODUCT/UPDATESUCCESS',
        payload: data
    }
}





