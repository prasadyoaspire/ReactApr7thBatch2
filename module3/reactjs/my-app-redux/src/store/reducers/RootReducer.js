import { combineReducers } from "redux";

import counterReducer from './CounterReducer';
import productReducer from "./ProductReducer";

const rootReducer = combineReducers({
    counterReducer,
    productReducer
})

export default rootReducer;