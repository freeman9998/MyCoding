import React, { Component } from "react";
import { Table, Button } from "react-bootstrap";
import { NavLink } from "react-router-dom";
import axios from "axios";
axios.defaults.withCredentials = true;
const headers = { withCredentials: true };

class BoardDetail extends Component {
  state = {
    board: []
  };

  componentDidMount() {
    if (this.props.location.query !== undefined) {
      this.getDetail();
    } else {
      window.location.href = "/";
    }
  }

  deleteBoard = _id => {
    const send_param = {
      headers,
      _id
    };
    if (window.confirm("정말 삭제하시겠습니까?")) {
      axios
        .post("http://localhost:8080/board/delete", send_param)
        //정상 수행
        .then(returnData => {
          alert("게시글이 삭제 되었습니다.");
          window.location.href = "/";
        })
        //에러
        .catch(err => {
          console.log(err);
          alert("글 삭제 실패");
        });
    }
  };

  getDetail = () => {
    const send_param = {
      headers,
      _id: this.props.location.query._id
    };
    const marginBottom = {
      marginBottom: 5
    };
    axios
      .post("http://localhost:8080/board/detail", send_param)
      //정상 수행
      .then(returnData => {
        if (returnData.data.board[0]) {
          const board = (
            <div>
              <Table striped bordered hover>
                <thead>
                  <tr>
                    <th>{returnData.data.board[0].title}</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td
                      dangerouslySetInnerHTML={{
                        __html: returnData.data.board[0].content
                      }}
                    ></td>
                  </tr>
                </tbody>
              </Table>
              <div>
                <NavLink
                  to={{
                    pathname: "/boardWrite",
                    query: {
                      title: returnData.data.board[0].title,
                      content: returnData.data.board[0].content,
                      _id: this.props.location.query._id
                    }
                  }}
                >
                  <Button block style={marginBottom}>
                    글 수정
                  </Button>
                </NavLink>
                <Button
                  block
                  onClick={this.deleteBoard.bind(
                    null,
                    this.props.location.query._id
                  )}
                >
                  글 삭제
                </Button>
              </div>
            </div>
          );
          this.setState({
            board: board
          });
        } else {
          alert("글 상세 조회 실패");
        }
      })
      //에러
      .catch(err => {
        console.log(err);
      });
  };

  //onClick={this.getBoard.bind(null,this.props._id)}
  render() {
    const divStyle = {
      margin: 50
    };
    return <div style={divStyle}>{this.state.board}</div>;
  }
}

export default BoardDetail;



/*
 01.flow
    01.BoardForm에서 query라는 이름으로 요청하고 서버에서 json을 반환 하고 BoardDetail에 있는 componentDidMount가 this.props.location으로 가져온다.
? 가져오는것 자체가 query라는게 변경되고 그걸 undefined랑 비교하는거니 깐 변경 시점에서 componentDidMount가 실행 될건데 componentDidMount라는 함수는 rendering 끝난 후에 실행되는 함수이기 때문에 rendering 먼저 하게 된다.
    01-1.그럼 this.getDetail()이라는 함수 실행시 _id값이 들어가게 되고 axios post 방식 요청이 들어가게 되고 또 json을 받아서 board를 만들어 주고 setState({board:board}) 후에 보여준다.
    02./boardWrite로 이동할때 속정으로 parm을 주고 이동
    >>BoardWriteForm으로 긔긔
*/