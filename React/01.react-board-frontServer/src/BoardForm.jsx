import React, { Component } from "react";
import { Table } from "react-bootstrap";
import { NavLink } from "react-router-dom";
import axios from "axios";
import $ from "jquery";
import { } from "jquery.cookie";
axios.defaults.withCredentials = true;
const headers = { withCredentials: true };

class BoardRow extends Component {
    render() {
      return (
        <tr>
          <td>
            <NavLink
              to={{ pathname: "/board/detail", query: { _id: this.props._id } }}
            >
              {this.props.createdAt.substring(0, 10)}
            </NavLink>
          </td>
          <td>
            <NavLink
              to={{ pathname: "/board/detail", query: { _id: this.props._id } }}
            >
              {this.props.title}
            </NavLink>
          </td>
        </tr>
      );
    }
  }

class BoardForm extends Component {
    state ={
        boardList:[]
    };

    componentDidMount(){
        this.getBoardList();
    };

    getBoardList = () => {
        const send_parm ={
            headers,
            _id: $.cookie("login_id")
        }
    }

    getBoardList = () => {
        const send_param = {
          headers,
          _id: $.cookie("login_id")
        };
        axios
          .post("http://localhost:8080/board/getBoardList", send_param)
          .then(returnData => {
            let boardList;
            if (returnData.data.list.length > 0) {
              // console.log(returnData.data.list.length);
              const boards = returnData.data.list;
              boardList = boards.map(item => (
                <BoardRow
                  key={Date.now() + Math.random() * 500}
                  _id={item._id}
                  createdAt={item.createdAt}
                  title={item.title}
                ></BoardRow>
              ));
              // console.log(boardList);
              this.setState({
                boardList: boardList
              });
            } else {
              boardList = (
                <tr>
                  <td colSpan="2">작성한 게시글이 존재하지 않습니다.</td>
                </tr>
              );
              this.setState({
                boardList: boardList
              });
              // window.location.reload();
            }
          })
          .catch(err => {
            console.log(err);
          });
      };

    render() {
        const divStyle = {
            margin: 50
        };

        return (
            <div>
                <div style={divStyle}>
                    <Table striped bordered hover>
                        <thead>
                            <tr>
                                <th>날짜</th>
                                <th>글 제목</th>
                            </tr>
                        </thead>
                        <tbody>{this.state.boardList}</tbody>
                    </Table>
                </div>
            </div>
        );
    }
}

export default BoardForm;
/*
 01.flow
    01.render로 뿌려줄 부분에 react의css를 작성 후에 return에 react-bootstrap을 쓰고 tbody에 boardList를 state로 설정해 준다.
    01-1.따라서 Form처음에 state안에 boardList:[]배열로 설정해 준 뒤, componentDidMount(render가 끝난 뒤의 lifecycle)에 this.getBoardList()함수를 실행 해 고 함수안에 조건을 맞춰준다.
    01-2.send_parm을 서버에 보내야 함으로 headers와 _id에 cookie세팅 해준 뒤에 http://localhost:8080/board/getBoardList에 send_param이랑 axios요청 보냄
    01-3.server.js에서 또 /board 보고 boardRouter안에 있는 getBoardList에서 성공하면 list라는 객체에 board데이터를 json형태로 반환 혹은 message에 false가 담겻허 json으로 반환 하고 BoardForm에서 받음
    01-4.returnData.data에 있는 list이라는 json덩어리를 boards에 넣고 그 덩어리를 .map으로 풀어준다. 그 item들은 BoardRow라는 component랑 컴포넌트에 쓸 애들을 속성처럼 넣어서 보내준다.
    01-5.BoardRow라는 component에서 데이터를 받으면 th 둘다에 tb로 detail로 가게끔 NavLink를 해주고 query로 _id를 보내준다.
    >>이번에는 서버로 요청해서 /board/detail로 이동한다. req로 _id를 받아서 board데이터를 json으로 반환해준다. 반환하면 BoardDetail에서 this.props.location로 받아 온다.
*/