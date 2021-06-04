// export * from './Resycmi12m01'// 인증성공횟수(시/도)
// export * from './Resycmi12m02'// 인증성공횟수(시/군/구)
// export * from './Resycmi12m03'// 인증성공횟수(읍/면/동/리)
// export * from './Resycmi12m04'// 기업별 제품인증횟수
// export * from './Resycmi12m05'// 단일제품인증성공횟수(시/도)
// export * from './Resycmi12m06'// 단일제품인증성공횟수(시/군/구)
// export * from './Resycmi12m07'// 단일제품인증성공횟수(읍/면/동/리)
// export * from './Resycmi12m08'// 단말기별 인증 횟수
// export * from './Resycmi12m09'// 인증실패현황
// export * from './Resycmi12m10'
// export * from './Resycmi12m11'// Rule적용 일련번호 조회
// export * from './Resycmi12m12'// 국가/제품별 인증내역 현황판
// export * from './Resycmi12m12/'// 국가/제품별 인증내역 현황판

import DashBoard from './DashBoard'
import Resycmi12m08 from './Resycmi12m08'
import Resycmi12m09 from './Resycmi12m09'

const ArrScreens = {
    DashBoard,
    Resycmi12m08,
    Resycmi12m09,
}

const Screens = {
    DashBoard    : DashBoard,
    Resycmi12m08 : Resycmi12m08,
    Resycmi12m09 : Resycmi12m09
}

export { ArrScreens, Screens }