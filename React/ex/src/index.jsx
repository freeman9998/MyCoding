import React from 'react'
import ReactDom from 'react-dom'
// import {BrowserRouster, Link} from 'react-router-dom'
import {HashRouter} from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css";
import Body from './Body'
import Header from './Header'
import Footer from './Footer'

ReactDom.render(
    <HashRouter>
        <Header/>
        <Body/>
        <Footer/>
    </HashRouter>,
    document.querySelector("#container")
);