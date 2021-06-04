import React from 'react'
import { BrowserRouter, Route, Switch } from 'react-router-dom'
import { PrivateRoute } from './PrivateRoute'
import * as Layout from '../layout'
import {Screens} from '../screens'

const Routes = () => {
    return (
        <BrowserRouter basename="/fms">
            <Switch>
                <Route path="/login" component={Layout.Login} />
                <Route path="/demo/:id" component={Screens.DashBoard} />
                <PrivateRoute path="/" component={Layout.MainLayout}/>
            </Switch>
        </BrowserRouter>
    )
}

export default Routes