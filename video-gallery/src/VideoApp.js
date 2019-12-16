import React from 'react';
import './style.css'
import VideoList from './VideoList'
import VideoContainer from './VideoContainer'

class VideoApp extends React.Component{
    render(){
        return <div className="grid-row reverse video-gallery"><VideoList/><VideoContainer/></div>
    }
}

export default VideoApp;