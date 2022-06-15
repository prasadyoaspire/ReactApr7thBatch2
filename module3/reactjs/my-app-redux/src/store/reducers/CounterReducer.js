const initialState = {
    counter : 0,   
}

function counterReducer(state=initialState, action) {

    if(action.type === 'counter/increment') {

        return {
            ...state,
            counter : state.counter+1
        }
    }
    else if(action.type === 'counter/decrement') {
        return {
            ...state,
            counter : state.counter-1
        }
    }
    else {
        return state;
    }
}