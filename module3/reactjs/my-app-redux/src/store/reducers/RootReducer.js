import { combineReducers } from "redux";

import counterReducer from './CounterReducer';
import productReducer from "./ProductReducer";
import authenticationReducer from "./AuthenticationReducer";

const rootReducer = combineReducers({
    counterReducer,
    productReducer,
    authenticationReducer
})

export default rootReducer;