import React from 'react'
import { Route } from 'react-router-dom'
import {ArrScreens, Screens} from '../screens'
import * as Layout from '../layout'

const ScreenRoute = (props) => {
    return (
        <>
        {/* <Route exact path="/" component={Layout.Home}/> */}
        <Route
            exact
            path='/'
            render={() => {
                return React.createElement(Screens['Resycmi12m09'], {...props})
            }}
        />
        {
            Object.keys(ArrScreens).map((screen, idx) => (
                <Route
                    key={idx}
                    path={`/${screen}`}
                    render={() => {
                        return React.createElement(Screens[screen], {...props})
                    }}
                />
            ))
        }
        </>
    )
}

export default ScreenRoute
