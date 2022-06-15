
import axios from "axios"

export function getAllProducts() {

    return (dispatch) => {

        return axios.get("http://localhost:8081/product/all").then(
            resp => {
                dispatch({
                    type: "product/all",
                    payload: resp.data
                })
            }
        )
    }
}
