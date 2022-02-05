import React from 'react';
import {BrowserRouter,Route,Routes} from 'react-router-dom';
import { Menu } from './Menu';
import { NewTournament } from './NewTournament';
import {Home } from './Home'
import { Athlete } from './Athlete';


const App=()=>{

 return(
     
   <BrowserRouter>
   <Menu/>
   <Routes>
   <Route path="/" exact element={<Home/>}/>
          <Route path="/new" exact element={<NewTournament/>}/>
          <Route path="/ath/:position" exact element={<Athlete/>}/>
   </Routes>
   
   </BrowserRouter>
   
 )
 }
 export default App
