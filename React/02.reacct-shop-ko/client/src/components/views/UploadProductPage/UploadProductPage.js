import React, { useState } from 'react';
import { Button , Form , Input} from 'antd';
import FileUpload from '../../utils/FileUpload';

const { TextArea } = Input;

const Continents =[
    {key:1, value:"Korea"},
    {key:2, value:"Europe"},
    {key:3, value:"Asia"},
    {key:4, value:"North America"},
    {key:5, value:"South America"},
    {key:4, value:"Australia"},
    {key:4, value:"Antarctica"}
]

function UploadProductPage() {

    const [Title, setTitle] = useState("")
    const [Descciption, setDescription] = useState("")
    const [Price, setPrice] = useState(0)
    const [Continent, setContinent] = useState(1)

    const [Images, setImages] = useState([])
    

    const titleChangeHandelr = (e) =>{
        setTitle(e.currentTarget.value);
    }
    
    const descriptionChangeHandler = (e) => {
        setDescription(e.currentTarget.value);
    }
    
    const priceChangeHandelr = (e) =>{
        setPrice(e.currentTarget.value);
    }

    const continentChangeHandler = (e) => {
        setContinent(e.currentTarget.value);
    }

    return (
        <div style={{maxWidth:'700px', margin:'2rem auto'}}>
            <div style={{textAlign:'center', marginBottom:'2rem'}}>
                <h1>여행 상품 업로드</h1>
            </div>

            <Form>
                {/* DropZone */}
                <FileUpload/>
                <br />
                <br />
                <label >이름</label>
                <Input onChange={titleChangeHandelr} placeholder="이름을 입력하세요" value={Title}/>
                <br />
                <br />
                <label>설명</label>
                <TextArea onChange={descriptionChangeHandler} placeholder="상품 설명을 입력하세요" value={Descciption}/>
                <br />
                <br />
                <label>가격($)</label>
                <Input type="number" onChange={priceChangeHandelr} placeholder="가격을 입력하세요" value={Price}/>
                <br />
                <br />
                <select onChange={continentChangeHandler} value={Continent} >
                    {Continents.map(item =>(
                        <option key={item.key} value={item.key}>{item.value}</option>
                        ))}
                </select>
                <br />
                <br />
                <Button >
                    확인
                </Button>
            </Form>

        </div>
    );
}

export default UploadProductPage;