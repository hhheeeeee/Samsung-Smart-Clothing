import { useState, useEffect } from 'react';
// import styled from 'styled-components';
import CurrentLocate from './CurrentLocate';
import { useLocateStore } from '@/store/LocateStore';
import StoreLocate from './LocateWeather';


function HomeLocate() {
    // 저장소 불러오기
    const { Sido, Sigungu } = useLocateStore()

    // 현재 좌표 정보
    const [latitude, setLatitude] = useState<number>(null)
    const [longitude, setLongitude] = useState<number>(null)


    // 현재위치를 잡기위한 hook(Sido, Sigungu 초기화 시)
    useEffect(() => {
        if (Sido === '' || Sigungu === '') {
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(
                    (position) => {
                        setLatitude(position.coords.latitude)
                        setLongitude(position.coords.longitude)
                    }
                )
            }
        }   
    }, [Sido, Sigungu])
  
    // Sido, Sigungu가 비워져있으며, 현재 좌표를 얻었을 때
    // 현재 좌표를 통해 Sido, Sigungu를 업데이트
    if ((latitude !== null && longitude !== null) && (Sido == '' || Sigungu == '')) {
        return (
            <div>
                <CurrentLocate latitude={latitude} longitude={longitude}/>
            </div>
        )
    // Sido, Sigungu가 비워져있으며, 현재 좌표를 얻지 못했을 때
    } else if ((latitude === null || longitude === null) && (Sido == '' || Sigungu == '')) {
        return (
            <div>위치 로딩중</div>
        )
    // Sido, Sigungu가 존재할 때
    } else {
        return (
          <StoreLocate/>
        )
    }

}



export default HomeLocate;


// const Container = styled.div`
// width: 100%;
// padding: 2rem;
// box-sizing: border-box;
// background-color: #ffffff;
// `