import React,{ Component } from "react";
import { Navbar, Button, Image } from "react-bootstrap";
import { NavLink } from "react-router-dom";
import axios from "axios";
import $ from "jquery";
import {} from "jquery.cookie";
axios.defaults.withCredentials = true;
const headers = { withCredentials:true};



class Header extends Component{
    state = {
        buttonDisplay: "none"
      };
    
      componentDidMount() {
        if ($.cookie("login_id")) {
          this.setState({
            buttonDisplay: "block"
          });
        } else {
          this.setState({
            buttonDisplay: "none"
          });
        }
      }

    render(){
        const buttonStyle={
            margin: "0px 5px 0px 10px",
          display: this.state.buttonDisplay
    };
    logout = () => {
        axios
          .get("http://localhost:8080/member/logout", {
            headers
          })
          .then(returnData => {
            if (returnData.data.message) {
              $.removeCookie("login_id");
              alert("로그아웃 되었습니다!");
              window.location.href = "/";
            }
          });
      };

    return (
        <div>
        <Navbar>
          <Navbar.Brand href="/">Today I Learned</Navbar.Brand>
          <Navbar.Toggle />
          <Navbar.Collapse className="justify-content-end">
            <NavLink to="/">
              <Button style={buttonStyle} variant="primary">
                글목록
              </Button>
            </NavLink>
            <NavLink to="/boardWrite">
              <Button style={buttonStyle} variant="primary">
                글쓰기
              </Button>
            </NavLink>
            <Button style={buttonStyle} onClick={this.logout} variant="primary">
              로그아웃
            </Button>
          </Navbar.Collapse>
        </Navbar>
        <Image src="./img/main.png" fluid />
      </div>
    );
  }  
}
export default Header;

/*
 00.import
    React,{ Component } from "reacct"; = react에 있는 component를 상속받아서 component라는걸 알려주기 위함
    { Navbar, Button, Image } from "react-bootstrap"; = rendering할 부분을 bootstrap으로 뿌려주기 위해 *원래 .css를 import받아서 사용하는건 react에서 reder속도와 효율면에서 권하지 않음, 비구조 분해로 필요한 파트만 가져옴
    { NavLink } from "react-router-dom"; = 버튼마다 요청 path를 정해주기 위함

 01.flow
    1. componentDidMount() = JQuery에 있는 $.cookie("login_id라는 파람이 들어옴") 버튼을 보여주고 안 보여주기 위한 기능
    1-1. state 안에 default 버튼 none으로 설정
    2. logout이라는 함수는 axios를 사용해서 alert를 띄어주고 window.location.htef로 redirection해줄 것임
    2-0. http://localhost:8080/member/logout으로 uri가 바뀌면서 서버 요청이 들어감
    2-0-1. 서버에 server.js가 momer/logout를 보고 ./routes/memberRouter에 있는 /logout을 요청함
    2-0-2. session을 없애면서 res.json에 message:true라는 객체를 담은 함수를 실행(보냄)
    2-1-2. front에서 그 message를 받으려면 returnData.data.message로 받는다.
    2-1-1. axios에 있는 withCredentials를 사용하면 다른 도메인이더라도 cookie값을 전달할 수 있음 import에 붙어있는 true 두개를 해주면 됨
    2-2. 로그아웃시에 cookie를 지우면서 / 으로 window.location.href해준다.
    
    3-0. body.jsx에 cookie.login_id의 여부에 따라 LoginForm or BoardForm으로 변경 됨
    >> Body.jsx
*/

