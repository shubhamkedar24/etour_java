
import { useEffect, useState } from 'react';
import Accordion from 'react-bootstrap/Accordion';
import { useParams } from 'react-router-dom';
import React  from 'react';
function Iternery(props) {

    const [iternery, setIternery] = useState([]);
    const { SSid } = useParams()
    useEffect(() => {
        fetch("http://localhost:8080/iternery/" + SSid)
            .then(res => res.json())
            .then((result) => { setIternery(result); }
            );
    }, []);

    const [pack, setPackage] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/package/" +SSid)
            .then(res => res.json())
            .then((result) => { setPackage(result); }
            );
    }, []);
  
    function calD(date1,date2){
        const date3=new Date(date1);
        const date4=new Date(date2);
        const diff = Math.abs(date4 - date3);
        const fin=diff / (1000 * 60 * 60 * 24);
        return(fin)
        ;            
    }
    function calN(date1,date2){
        const date3=new Date(date1);
        const date4=new Date(date2);
        const diff = Math.abs(date4 - date3);
        const fin=diff / (1000 * 60 * 60 * 24);
        return(fin-1)
        ;            
    }
   
    return (
        
        <div>
            <div>
            {/*  */} {/* {pack.slice(0,count).map((cust,i) => ( */}
            {pack.filter((cust, i) => i <=0).map((cust,i) => ( 
                <div key={i} >
                    <hr></hr>
                         <p>Itnerary is valid from {cust.startdate} to {cust.enddate}</p>
                         <h3>{cust.packagename}</h3>
                         <p> {calD(`${cust.startdate}`,`${cust.enddate}`)} Days {calN(`${cust.startdate}`,`${cust.enddate}`)}  Hotel Nights</p>
                        {/* <button onClick={addMore}>Add More</button> */}
                         </div>
                   
                   )) }
                </div>
                <hr></hr>
             {iternery.map(itr => (
                        <Accordion defaultActiveKey="1">
                            <Accordion.Item eventKey="0">
                                <Accordion.Header>{itr.day}</Accordion.Header>
                                <Accordion.Body>
                                    {itr.description}
                                </Accordion.Body>
                            </Accordion.Item>
                        </Accordion>
                    ))}
            <br></br>
            <br></br>


        </div>
    );
}

export default Iternery;