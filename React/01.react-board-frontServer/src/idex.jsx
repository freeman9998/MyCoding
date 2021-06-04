import React from "react";
import ReactDOM from "react-dom";
import { HashRouter } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import Header from "./Header";
import Body from "./Body";
import Footer from "./Footer";

ReactDOM.render(
    <HashRouter>
        <Header/>
        <Body/>
        <Footer/>
    </HashRouter>,
    document.querySelector("#container")
);

/*
 00.import 
    React from "react"; = react의 component를 사용하기 위함
    ReactDOM from "react-dom"; = ReactDOM을 사용하기 위함
//    import { HashRouter } from 'react-router-dom'; = react-router를 사용하기 위함
    "bootstrap/dist/css/bootstrap.min.css"; = bootstrap을 사용하기 위해선 index.jsx에서 import를 해 줘야 한다
    Header, Body, Footer = componet들 가져옴

 01.render를 해주기 위해 돔트리를 렌더링해줌 ReactDOM.render( components, 위치(document.querySelector("#container"= id가 container라는 뜻)))
 02.부분적으로 화면 전환을 해주기 위해 HashRouter로 components를 감싸준다.

 >>Header 부터 뿌리러 Header.jsx로 이동
*/