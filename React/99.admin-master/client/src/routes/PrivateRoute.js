import React from 'react'
import { Route, Redirect } from 'react-router-dom'

const PrivateRoute = ({ component: Component, ...rest }) => {
    const user = JSON.parse(localStorage.getItem('user'))

    return (
        <Route {...rest} render={props => (
            user === null
                ? <Redirect exact to={{ pathname: '/login', state: { from: props.location } }} />
                : <Component {...props}/>
        )} />
    )
}

export {PrivateRoute } 
