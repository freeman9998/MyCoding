import { handleActions } from 'redux-actions'
import axios from 'axios'

const LOGIN_REQUEST = 'LOGIN_REQUEST'
const LOGIN_SUCCESS = 'LOGIN_SUCCESS'
const LOGIN_FAILURE = 'LOGIN_FAILURE'

const DEMO_REQUEST = 'DEMO_REQUEST'
const DEMO_SUCCESS = 'DEMO_SUCCESS'
const DEMO_FAILURE = 'DEMO_FAILURE'

const SELECT_REQUEST   = 'SELECT_REQUEST'
const SELECT_SUCCESS   = 'SELECT_SUCCESS'
const SELECT_FAILURE   = 'SELECT_FAILURE'

const MainPATH = '/api'

export const login = (params) => dispatch => {
    dispatch({
        type : LOGIN_REQUEST
    })

    return axios.get(`${MainPATH}/login`, {params})
                .then((res) => {
                    console.log(res)
                    dispatch({
                        type    : LOGIN_SUCCESS,
                        payload : res.data.data
                    })
                    localStorage.setItem('user', JSON.stringify(res.data.data))
                    return res.data
                })
                // .then((data) => {
                //     dispatch({
                //         type    : LOGIN_SUCCESS,
                //         payload : data
                //     })
                // })
                .catch((error) => {
                    dispatch({
                        type    : LOGIN_FAILURE,
                        payload : error
                    })
                })
}

export const demoLogin = (params) => dispatch => {
    dispatch({
        type : DEMO_REQUEST
    })

    return axios.get(`${MainPATH}/login/demo`, {params})
                .then((res) => {
                    dispatch({
                        type    : DEMO_SUCCESS,
                        payload : res.data.data
                    })

                    return res.data
                })
                .catch((error) => {
                    dispatch({
                        type    : DEMO_FAILURE,
                        payload : error
                    })
                })
}

export const select = (name, path, params) => dispatch => {
    dispatch({
        type : SELECT_REQUEST
    })

    return axios.get(`${MainPATH}/${path}`, {params:params})
                .then((res) => {
                    const rs = res.data

                    if(rs.resultCode !== 200) {
                        const error = (rs.resultMsg && rs.resultMsg) || rs.resultCode
                        return Promise.reject(error);
                    }
                
                    return rs.data
                })
                .then((data) => {
                    dispatch({
                        type : SELECT_SUCCESS,
                        name : name,
                        payload : data
                    })
                })
                .catch((error) => {
                    dispatch({
                        type : SELECT_FAILURE,
                        payload : error
                    })
                })
}

export default handleActions({
    [LOGIN_REQUEST]: (state, action) => {
        return {
            ...state,
            pending: true,
            error: false
        };
    },
    [LOGIN_SUCCESS]: (state, action) => {
        return {
            ...state,
            pending: false,
            user : action.payload
        };
    },
    [LOGIN_FAILURE]: (state, action) => {
        return {
            ...state,
            pending: false,
            error: true
        }
    },
    [DEMO_REQUEST]: (state, action) => {
        return {
            ...state,
            pending: true,
            error: false
        };
    },
    [DEMO_SUCCESS]: (state, action) => {
        return {
            ...state,
            pending: false,
            [action.name] : action.payload
        };
    },
    [DEMO_FAILURE]: (state, action) => {
        return {
            ...state,
            pending: false,
            error: true
        }
    },
    [SELECT_REQUEST]: (state, action) => {
        return {
            ...state,
            pending: true,
            error: false
        }
    },
    [SELECT_SUCCESS]: (state, action) => {
        return {
            ...state,
            pending: true,
            error: false,
            [action.name] : action.payload
        }
    },
    [SELECT_FAILURE]: (state, action) => {
        return {
            ...state,
            pending: false,
            error: true
        }
    }
},{
    pending : false,
    error   : false,
})