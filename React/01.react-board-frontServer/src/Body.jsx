import React, { Component } from "react";
import { Route } from "react-router-dom";
import $ from "jquery";
import {} from "jquery.cookie";
import LoginForm from "./LoginForm";
import BoardForm from "./BoardForm";
import BoardWriteForm from "./BoardWriteForm";
import BoardDetail from "./BoardDetail";
import MypageForm from "./MypageForm";

class Body extends Component {
    render() {
        let resultForm;
        function getResultFrom(){
            if ($.cookie("login_id")) {
                resultForm = <Route exact path="/" component={BoardForm} />;
                return resultForm;
            } else {
                resultForm = <Route exact path="/" component={LoginForm} />;
                return resultForm;
            }
        }
        getResultFrom();

        return (
            <div>
                <Route path="/mypage" component={MypageForm}></Route>
                <Route path="/boardWrite" component={BoardWriteForm}></Route>
                <Route path="/board/detail" component={BoardDetail}></Route>
                {resultForm}
            </div>
        );
    }

}
export default Body;

/*
 00.import
    React, { Component } from "react"; = component를 사용하기 위함
    { Route } from "react-router-dom"; = Route로 조건에 따라 /의 위치를 Board or Member로 요청을 먼저 가게 하기 위함
    $ from "jquery"; = $로 쿠키를 가져오기 위함 
    {} from "jquery.cookie"; = jquery.cookie를 사용하기 위함
    나머지 components
 01.flow
    01. resultForm이라는 form변경 함수를 만들고 기능을 구현하고 실행해 준뒤 return으로 들어온 rewultForm을 render에 return안의 div안에 jsp문으로 변경된 Form을 넣어줄 것이다.
    01-1. exact path="/" component={LoginForm} = 결과적으로 rewultForm의 component로 LoginForm이 들어가고 route해준다.
    >>LoginForm으로 이동
*/