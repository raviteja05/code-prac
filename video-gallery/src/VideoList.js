import React from 'react'

class VideoList extends React.Component{
    
    render(){
        const videos=[{"url":"https://www.youtube.com/embed/ROqDTIxRX0Y","id":"video-1","name":"Option 1","code":"1"},{"url":"https://www.youtube.com/embed/9iGoDNlKY-g","id":"video-2","name":"Option 2","code":"2"},{"url":"https://www.youtube.com/embed/l70UhhNalqA","id":"video-3","name":"Option 3","code":"3"},{"url":"https://www.youtube.com/embed/XDrB5c4-c9Y","id":"video-4","name":"Option 4","code":"4"},{"url":"https://www.youtube.com/embed/UXP307MGQzs","id":"video-5","name":"Option 5","code":"5"},{"url":"https://www.youtube.com/embed/0kY0Q5hdjDI","id":"video-6","name":"Option 6","code":"6"}]

    return videos.map(video=>{return <React.Fragment><input key={video.id} type="radio" value={video.code} name="video-list" id={video.id} /><label htmlFor={video.id}>{video.name}</label></React.Fragment>});
           }

    
}

export default VideoList;