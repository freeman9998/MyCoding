import i18n from 'i18next'
import {initReactI18next} from 'react-i18next'
import translationKO from './translation.ko'
import translationEN from './translation.en'
import translationVN from './translation.vn'

const resource = {
    US: {
        translation: translationEN,
    },
    KR: {
        translation: translationKO,
    },
    VN: {
        translation: translationVN,
    },
}

// const lng = 'KR'
// const fallbackLng = 'KR'
// const user = JSON.parse(localStorage.getItem('user'))

// if(user != null) {
//     lng = user.country_cd
//     fallbackLng = user.country_cd
// }

i18n
    .use(initReactI18next)
    .init({
        resources     : resource,
        // lng           : user.country_cd,
        // fallbackLng   : user.country_cd,
        lng           : 'KR',
        fallbackLng   : 'KR',
        debug         : true,
        // keySeparator  : false,
        interpolation : { 
            escapeValue: false
        },
    })

export default i18n