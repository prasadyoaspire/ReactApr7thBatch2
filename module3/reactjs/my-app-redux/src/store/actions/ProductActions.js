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







