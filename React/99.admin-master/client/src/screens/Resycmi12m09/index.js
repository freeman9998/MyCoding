import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import * as UI from '../../utils/material'
import * as Actions from '../../modules/common'
import { useTranslation } from 'react-i18next'

import DatePicker from './DatePicker'
import TableBiz from './TableBiz'
import TableOrder from './TableOrder'
import ComboChart from './ComboChart'
import WorldGeoChart from './WorldGeoChart'
import RegionGeoChart from './RegionGeoChart'
import PieChart from './PieChart'

const getDateString = (flag, date) => {
    if(flag === 'yy') {
        return date.getFullYear().toString()
    } else
    if(flag === 'mm') {
        const mm = (date.getMonth() + 1).toString()
        return (mm[1] ? mm : '0' + mm[0])
    } else
    if(flag === 'dd') {
        const dd = date.getDate().toString()
        return (dd[1] ? dd : '0' + dd[0])
    } else
    if(flag === 'ymd') {
        const yy = date.getFullYear().toString()
        const mm = (date.getMonth() + 1).toString()
        const dd = date.getDate().toString()
  
        const ymd = yy + (mm[1] ? mm : '0' + mm[0]) + (dd[1] ? dd : '0' + dd[0])
  
        return ymd
    }
}

const PATH      = "resycmi12m09"
const MAPAPIKEY = "AIzaSyBMxrheIPZdvb04-2r9SSdl-U8I34VOk6s"

const styles = {
    width : '100%',
    height : '100%',
    position : 'absolute'
}

const obj = {
    biz : {
        state  : `${PATH}_bizList`,
        action : 'bizList',
        path   : PATH
    },
    order : {
        state  : `${PATH}_orderList`,
        action : 'orderList',
        path   : PATH
    },
    comboChart : {
        state  : `${PATH}_comboChartList`,
        action : 'comboChartList',
        path   : 'resycmi12m09/comboChartList'
    },
    worldGeo : {
        state  : `${PATH}_worldGeoList`,
        action : 'worldGeoList',
        path   : PATH
    },
    regionGeo : {
        state  : `${PATH}_regionGeoList`,
        action : 'regionGeoList',
        path   : PATH
    },
    devicePie : {
        state  : `${PATH}_devicePieList`,
        action : 'devicePieList',
        path   : PATH
    },
    genderPie : {
        state  : `${PATH}_genderPieList`,
        action : 'genderPieList',
        path   : PATH
    },
}

function useAsyncState(initialValue) {
    const [value, setValue] = React.useState(initialValue);
    const setter = x =>
      new Promise(resolve => {
        setValue(x)
        resolve(x)
      });
    return [value, setter]
}

const Resycmi12m09 = ({user}) => {
    const { t, i18n } = useTranslation()
    const classes     = UI.usemakeStyles()
    const dispatch    = useDispatch()

    const objOption = {
        worldGeo : [
            t('country'), t('detect count')
        ],
        regionGeo : [
            t('city'), t('detect count')
        ],
        devicePie : [
            t('device'), t('detect count'), t('manufacturer')
        ],
        genderPie : [
            t('gender'), t('detect count')
        ],
    }

    const bizData       = useSelector((state) => state.data[obj.biz.state])
    const orderData     = useSelector((state) => state.data[obj.order.state])
    const chartData     = useSelector((state) => state.data[obj.comboChart.state])
    const worldGeoData  = useSelector((state) => state.data[obj.worldGeo.state])
    const regionGeoData = useSelector((state) => state.data[obj.regionGeo.state])
    const devicePieData = useSelector((state) => state.data[obj.devicePie.state])
    const genderPieData = useSelector((state) => state.data[obj.genderPie.state])

    // const [selectedBizList  , setSelectedBizList  ] = React.useState([])
    // const [selectedOrderList, setSelectedOrderList] = React.useState([])
    // const [pickerDate       , setPickerDate       ] = React.useState(new Date())
    // const [dateCd           , setDateCd           ] = React.useState('Y')
    // const [locationCd       , setLocationCd       ] = React.useState(user.country_cd)
    // const [addrCity         , setAddrCity         ] = React.useState('')

    // const [biz, setBiz] = React.useState({
    //     proc : obj.biz,
    //     params : {
    //         user_id : user.user_id,
    //         date_cd : dateCd,
    //         rgst_yy : getDateString('yy', pickerDate),
    //         rgst_mm : getDateString('mm', pickerDate),
    //     }
    // })

    // const [order, setOrder] = React.useState({
    //     proc : obj.order,
    //     params : {
    //         user_id : user.user_id,
    //         auth_cd : user.auth_cd,
    //         date_cd : dateCd,
    //         rgst_yy : getDateString('yy', pickerDate),
    //         rgst_mm : getDateString('mm', pickerDate),
    //         biz_id  : []
    //     }
    // })

    // const [comboChart, setComboChart] = React.useState({
    //     proc : obj.comboChart,
    //     params : {
    //         rgst_yy   : getDateString('yy', pickerDate),
    //         rgst_mm   : getDateString('mm', pickerDate),
    //         biz_id    : [],
    //         order_seq : []
    //     }
    // })

    // const [worldGeo, setWorldGeo] = React.useState({
    //     proc : obj.worldGeo,
    //     params : {
    //         date_cd   : dateCd,
    //         rgst_yy   : getDateString('yy', pickerDate),
    //         rgst_mm   : getDateString('mm', pickerDate),
    //         biz_id    : [],
    //         order_seq : [],
    //         lan_cd    : i18n.language
    //     },
    //     option : objOption.worldGeo
    // })

    // const [regionGeo, setRegionGeo] = React.useState({
    //     proc : obj.regionGeo,
    //     params : {
    //         date_cd     : dateCd,
    //         rgst_yy     : getDateString('yy', pickerDate),
    //         rgst_mm     : getDateString('mm', pickerDate),
    //         biz_id      : [],
    //         order_seq   : [],
    //         location_cd : locationCd,
    //         lan_cd      : i18n.language
    //     },
    //     option : objOption.regionGeo
    // })

    // const [devicePie, setDevicePie] = React.useState({
    //     proc : obj.devicePie,
    //     params : {
    //         date_cd     : dateCd,
    //         rgst_yy     : getDateString('yy', pickerDate),
    //         rgst_mm     : getDateString('mm', pickerDate),
    //         biz_id      : [],
    //         order_seq   : [],
    //         location_cd : locationCd,
    //         addr_city   : addrCity,
    //         lan_cd      : i18n.language
    //     },
    //     option : objOption.devicePie
    // })

    // const [genderPie, setGenderPie] = React.useState({
    //     proc : obj.genderPie,
    //     params : {
    //         date_cd     : dateCd,
    //         rgst_yy     : getDateString('yy', pickerDate),
    //         rgst_mm     : getDateString('mm', pickerDate),
    //         biz_id      : [],
    //         order_seq   : [],
    //         location_cd : locationCd,
    //         addr_city   : addrCity,
    //         lan_cd      : i18n.language
    //     },
    //     option : objOption.genderPie
    // })

    const [selectedBizList  , setSelectedBizList  ] = useAsyncState([])
    const [selectedOrderList, setSelectedOrderList] = useAsyncState([])
    const [pickerDate       , setPickerDate       ] = useAsyncState(new Date())
    const [dateCd           , setDateCd           ] = useAsyncState('Y')
    const [locationCd       , setLocationCd       ] = useAsyncState(user.country_cd)
    const [addrCity         , setAddrCity         ] = useAsyncState('')

    const [biz, setBiz] = useAsyncState({
        proc : obj.biz,
        params : {
            user_id : user.user_id,
            date_cd : dateCd,
            rgst_yy : getDateString('yy', pickerDate),
            rgst_mm : getDateString('mm', pickerDate),
        }
    })

    const [order, setOrder] = useAsyncState({
        proc : obj.order,
        params : {
            user_id : user.user_id,
            auth_cd : user.auth_cd,
            date_cd : dateCd,
            rgst_yy : getDateString('yy', pickerDate),
            rgst_mm : getDateString('mm', pickerDate),
            biz_id  : []
        }
    })

    const [comboChart, setComboChart] = useAsyncState({
        proc : obj.comboChart,
        params : {
            rgst_yy   : getDateString('yy', pickerDate),
            rgst_mm   : getDateString('mm', pickerDate),
            biz_id    : [],
            order_seq : []
        }
    })

    const [worldGeo, setWorldGeo] = useAsyncState({
        proc : obj.worldGeo,
        params : {
            date_cd   : dateCd,
            rgst_yy   : getDateString('yy', pickerDate),
            rgst_mm   : getDateString('mm', pickerDate),
            biz_id    : [],
            order_seq : [],
            lan_cd    : i18n.language
        },
        option : objOption.worldGeo
    })

    const [regionGeo, setRegionGeo] = useAsyncState({
        proc : obj.regionGeo,
        params : {
            date_cd     : dateCd,
            rgst_yy     : getDateString('yy', pickerDate),
            rgst_mm     : getDateString('mm', pickerDate),
            biz_id      : [],
            order_seq   : [],
            location_cd : locationCd,
            lan_cd      : i18n.language
        },
        option : objOption.regionGeo
    })

    const [devicePie, setDevicePie] = useAsyncState({
        proc : obj.devicePie,
        params : {
            date_cd     : dateCd,
            rgst_yy     : getDateString('yy', pickerDate),
            rgst_mm     : getDateString('mm', pickerDate),
            biz_id      : [],
            order_seq   : [],
            location_cd : locationCd,
            addr_city   : addrCity,
            lan_cd      : i18n.language
        },
        option : objOption.devicePie
    })

    const [genderPie, setGenderPie] = useAsyncState({
        proc : obj.genderPie,
        params : {
            date_cd     : dateCd,
            rgst_yy     : getDateString('yy', pickerDate),
            rgst_mm     : getDateString('mm', pickerDate),
            biz_id      : [],
            order_seq   : [],
            location_cd : locationCd,
            addr_city   : addrCity,
            lan_cd      : i18n.language
        },
        option : objOption.genderPie
    })

    const getList = async (obj) => {
        try {
            dispatch(Actions.select(obj.proc.state, obj.proc.path, obj))
        } catch(e) {
            console.log("getList Error="+e)
        }
    }

    const reSettingOrderList = React.useCallback(() => {
        const newSelectedList = selectedOrderList.filter((order_seq) => {
            return orderData.findIndex((rs) => {
                return rs.order_seq === order_seq
            }) !== -1
        })
        
        setSelectedOrderList(newSelectedList)
    }, [orderData])

    React.useEffect(() => {
        reSettingOrderList()
    }, [reSettingOrderList])

    // React.useEffect(() => {getList(biz)}, [biz])
    // React.useEffect(() => {getList(order)}, [order])
    // React.useEffect(() => {getList(comboChart)}, [comboChart])
    // React.useEffect(() => {getList(worldGeo)}, [worldGeo])
    // React.useEffect(() => {getList(regionGeo)}, [regionGeo])
    // React.useEffect(() => {getList(devicePie)}, [devicePie])
    // React.useEffect(() => {getList(genderPie)}, [genderPie])

    // React.useEffect(() => {
        // setBiz      ({...biz      , params : {...biz.params      , date_cd : dateCd}})
        // setOrder    ({...order    , params : {...order.params    , date_cd : dateCd}})
        // setWorldGeo ({...worldGeo , params : {...worldGeo.params , date_cd : dateCd}})
        // setRegionGeo({...regionGeo, params : {...regionGeo.params, date_cd : dateCd}})
        // setDevicePie({...devicePie, params : {...devicePie.params, date_cd : dateCd}})
        // setGenderPie({...genderPie, params : {...genderPie.params, date_cd : dateCd}})
    // }, [dateCd])

    // React.useEffect(() => {
        // setBiz       ({...biz       , params : {...biz.params       , rgst_yy : getDateString('yy', pickerDate), rgst_mm : getDateString('mm', pickerDate)}})
        // setOrder     ({...order     , params : {...order.params     , rgst_yy : getDateString('yy', pickerDate), rgst_mm : getDateString('mm', pickerDate)}})
        // setComboChart({...comboChart, params : {...comboChart.params, rgst_yy : getDateString('yy', pickerDate), rgst_mm : getDateString('mm', pickerDate)}})
        // setWorldGeo  ({...worldGeo  , params : {...worldGeo.params  , rgst_yy : getDateString('yy', pickerDate), rgst_mm : getDateString('mm', pickerDate)}})
        // setRegionGeo ({...regionGeo , params : {...regionGeo.params , rgst_yy : getDateString('yy', pickerDate), rgst_mm : getDateString('mm', pickerDate)}})
        // setDevicePie ({...devicePie , params : {...devicePie.params , rgst_yy : getDateString('yy', pickerDate), rgst_mm : getDateString('mm', pickerDate)}})
        // setGenderPie ({...genderPie , params : {...genderPie.params , rgst_yy : getDateString('yy', pickerDate), rgst_mm : getDateString('mm', pickerDate)}})
    // }, [pickerDate])

    // React.useEffect(() => {
        // setRegionGeo({...regionGeo, params : {...regionGeo.params, location_cd : locationCd}})
        // setDevicePie({...devicePie, params : {...devicePie.params, location_cd : locationCd}})
        // setGenderPie({...genderPie, params : {...genderPie.params, location_cd : locationCd}})
    // }, [locationCd])

    // React.useEffect(() => {
    //     setDevicePie({...devicePie, params : {...devicePie.params, addr_city : addrCity}})
    //     setGenderPie({...genderPie, params : {...genderPie.params, addr_city : addrCity}})
    // }, [addrCity])

    // React.useEffect(() => {
        // setOrder     ({...order     , params : {...order.params     , biz_id : selectedBizList}})
        // setComboChart({...comboChart, params : {...comboChart.params, biz_id : selectedBizList}})
        // setWorldGeo  ({...worldGeo  , params : {...worldGeo.params  , biz_id : selectedBizList}})
        // setRegionGeo ({...regionGeo , params : {...regionGeo.params , biz_id : selectedBizList}})
        // setDevicePie ({...devicePie , params : {...devicePie.params , biz_id : selectedBizList}})
        // setGenderPie ({...genderPie , params : {...genderPie.params , biz_id : selectedBizList}})
    // }, [selectedBizList])

    // React.useEffect(() => {
        // setComboChart({...comboChart, params : {...comboChart.params, order_seq : selectedOrderList}})
        // setWorldGeo  ({...worldGeo  , params : {...worldGeo.params  , order_seq : selectedOrderList}})
        // setRegionGeo ({...regionGeo , params : {...regionGeo.params , order_seq : selectedOrderList}})
        // setDevicePie ({...devicePie , params : {...devicePie.params , order_seq : selectedOrderList}})
        // setGenderPie ({...genderPie , params : {...genderPie.params , order_seq : selectedOrderList}})
    // }, [selectedOrderList])

    // React.useEffect(() => {
    //     setWorldGeo ({...worldGeo , params : {...worldGeo.params , lan_cd : i18n.language}, option : objOption.worldGeo})
    //     setRegionGeo({...regionGeo, params : {...regionGeo.params, lan_cd : i18n.language}, option : objOption.regionGeo})
    //     setDevicePie({...devicePie, params : {...devicePie.params, lan_cd : i18n.language}, option : objOption.devicePie})
    //     setGenderPie({...genderPie, params : {...genderPie.params, lan_cd : i18n.language}, option : objOption.genderPie})
    // }, [t])

    React.useEffect(() => {
        setWorldGeo ({...worldGeo , params : {...worldGeo.params , lan_cd : i18n.language}, option : objOption.worldGeo}).then((worldGeo) => getList(worldGeo))
        setRegionGeo({...regionGeo, params : {...regionGeo.params, lan_cd : i18n.language}, option : objOption.regionGeo}).then((regionGeo) => getList(regionGeo))
        setDevicePie({...devicePie, params : {...devicePie.params, lan_cd : i18n.language}, option : objOption.devicePie}).then((devicePie) => getList(devicePie))
        setGenderPie({...genderPie, params : {...genderPie.params, lan_cd : i18n.language}, option : objOption.genderPie}).then((genderPie) => getList(genderPie))
    }, [t])

    // const clearAll = () => {
    //     setPickerDate(new Date())
    //     setDateCd('Y')
    //     setLocationCd(user.country_cd)
    //     setAddrCity('')
    //     setSelectedBizList([])
    //     setSelectedOrderList([])
    // }

    // const handleSearch = () => {
    //     clearAll()
    //     getList(biz)
    //     getList(order)
    // }

    React.useEffect(() => {
        getList(biz)
        getList(order)
    }, [])

    const handleOnChange = (e) => {
        setDateCd(e.target.value).then((dateCd) => {
            setBiz      ({...biz      , params : {...biz.params      , date_cd : dateCd}}).then((biz)       => getList(biz))
            setOrder    ({...order    , params : {...order.params    , date_cd : dateCd}}).then((order)     => getList(order))
            setWorldGeo ({...worldGeo , params : {...worldGeo.params , date_cd : dateCd}}).then((worldGeo)  => getList(worldGeo))
            setRegionGeo({...regionGeo, params : {...regionGeo.params, date_cd : dateCd}}).then((regionGeo) => getList(regionGeo))
            setDevicePie({...devicePie, params : {...devicePie.params, date_cd : dateCd}}).then((devicePie) => getList(devicePie))
            setGenderPie({...genderPie, params : {...genderPie.params, date_cd : dateCd}}).then((genderPie) => getList(genderPie))
        })
    }

    const handleDatePicker = (date) => {
        setPickerDate(date).then((date) => {
            setBiz       ({...biz       , params : {...biz.params       , rgst_yy : getDateString('yy', date), rgst_mm : getDateString('mm', date)}}).then((biz)        => getList(biz))
            setOrder     ({...order     , params : {...order.params     , rgst_yy : getDateString('yy', date), rgst_mm : getDateString('mm', date)}}).then((order)      => getList(order))
            setComboChart({...comboChart, params : {...comboChart.params, rgst_yy : getDateString('yy', date), rgst_mm : getDateString('mm', date)}}).then((comboChart) => getList(comboChart))
            setWorldGeo  ({...worldGeo  , params : {...worldGeo.params  , rgst_yy : getDateString('yy', date), rgst_mm : getDateString('mm', date)}}).then((worldGeo)   => getList(worldGeo))
            setRegionGeo ({...regionGeo , params : {...regionGeo.params , rgst_yy : getDateString('yy', date), rgst_mm : getDateString('mm', date)}}).then((regionGeo)  => getList(regionGeo))
            setDevicePie ({...devicePie , params : {...devicePie.params , rgst_yy : getDateString('yy', date), rgst_mm : getDateString('mm', date)}}).then((devicePie)  => getList(devicePie))
            setGenderPie ({...genderPie , params : {...genderPie.params , rgst_yy : getDateString('yy', date), rgst_mm : getDateString('mm', date)}}).then((genderPie)  => getList(genderPie))
        })
    }

    const CallBackTableBiz = (selectedBiz) => {
        setSelectedBizList(selectedBiz).then((selectedBizList) => {
            setOrder     ({...order     , params : {...order.params     , biz_id : selectedBizList}}).then((order)      => getList(order))
            setComboChart({...comboChart, params : {...comboChart.params, biz_id : selectedBizList}}).then((comboChart) => getList(comboChart))
            setWorldGeo  ({...worldGeo  , params : {...worldGeo.params  , biz_id : selectedBizList}}).then((worldGeo)   => getList(worldGeo))
            setRegionGeo ({...regionGeo , params : {...regionGeo.params , biz_id : selectedBizList}}).then((regionGeo)  => getList(regionGeo))
            setDevicePie ({...devicePie , params : {...devicePie.params , biz_id : selectedBizList}}).then((devicePie)  => getList(devicePie))
            setGenderPie ({...genderPie , params : {...genderPie.params , biz_id : selectedBizList}}).then((genderPie)  => getList(genderPie))
        })
    }

    const CallBackTableOrder = (selectedOrder) => {
        setSelectedOrderList(selectedOrder).then((selectedOrderList) => {
            setComboChart({...comboChart, params : {...comboChart.params, order_seq : selectedOrderList}}).then((comboChart) => getList(comboChart))
            setWorldGeo  ({...worldGeo  , params : {...worldGeo.params  , order_seq : selectedOrderList}}).then((worldGeo)   => getList(worldGeo))
            setRegionGeo ({...regionGeo , params : {...regionGeo.params , order_seq : selectedOrderList}}).then((regionGeo)  => getList(regionGeo))
            setDevicePie ({...devicePie , params : {...devicePie.params , order_seq : selectedOrderList}}).then((devicePie)  => getList(devicePie))
            setGenderPie ({...genderPie , params : {...genderPie.params , order_seq : selectedOrderList}}).then((genderPie)  => getList(genderPie))
        })
    }

    const CallBackWorldGeo = (region) => {
        setAddrCity('').then(() => {
            setLocationCd(region).then((region) => {
                setRegionGeo({...regionGeo, params : {...regionGeo.params, location_cd : region}}).then((regionGeo)  => getList(regionGeo))
                setDevicePie({...devicePie, params : {...devicePie.params, location_cd : region}}).then((devicePie)  => getList(devicePie))
                setGenderPie({...genderPie, params : {...genderPie.params, location_cd : region}}).then((genderPie)  => getList(genderPie))
            })
        })
    }

    const CallBackRegionGeo = (city) => {
        // setAddrCity(city)
    }

    return (
        <div className={classes.root}>
            <UI.Grid container spacing={3}>
                <UI.Grid item xs={12}>
                    <UI.Paper className={classes.paper}>
                        <UI.FormControl variant="outlined">
                            <UI.InputLabel id="rgstYmd-label">{t('reference')}</UI.InputLabel>
                            <UI.Select
                                labelId="rgstYmd-label"
                                id="demo-simple-select-outlined"
                                value={dateCd}
                                label={t('reference')}
                                onChange={handleOnChange}
                                style={{width:'100px'}}
                            >
                                <UI.MenuItem value='Y'>{t('year')}</UI.MenuItem>
                                <UI.MenuItem value='M'>{t('month')}</UI.MenuItem>
                            </UI.Select>
                      </UI.FormControl>
                      <DatePicker value={pickerDate} dateCd={dateCd} onChange={handleDatePicker}/>
                      {/* <UI.Button
                        ml={3}
                        variant="contained"
                        color="primary"
                        size="large"
                        onClick={handleSearch}
                    >{t('search')}</UI.Button> */}
                    </UI.Paper>
                </UI.Grid>
                {user.auth_cd === 'AU00'
                ?
                <>
                <UI.Grid item xs={12} sm={6}>
                    <UI.Paper className={classes.paper}>
                        <TableBiz data={bizData} callback={CallBackTableBiz} selectedBizList={selectedBizList}/>
                    </UI.Paper>
                </UI.Grid>
                <UI.Grid item xs={12} sm={6}>
                    <UI.Paper className={classes.paper}>
                        <TableOrder data={orderData} callback={CallBackTableOrder} selectedOrderList={selectedOrderList}/>
                    </UI.Paper>
                </UI.Grid>
                </>
                :
                <UI.Grid item xs={12}>
                    <UI.Paper className={classes.paper}>
                        <TableOrder data={orderData} callback={CallBackTableOrder} selectedOrderList={selectedOrderList}/>
                    </UI.Paper>
                </UI.Grid>
                }
                <UI.Grid item xs={12}>
                    <UI.Paper className={classes.paper}>
                        <ComboChart data={chartData} styles={styles} rgstYy={getDateString('yy', pickerDate)}/>
                    </UI.Paper>
                </UI.Grid>
                <UI.Grid item xs={12} sm={6}>
                    <UI.Paper className={classes.paper}>
                        <WorldGeoChart data={worldGeoData} callback={CallBackWorldGeo} styles={styles} mapsApiKey={MAPAPIKEY}/>
                    </UI.Paper>
                </UI.Grid>
                <UI.Grid item xs={12} sm={6}>
                    <UI.Paper className={classes.paper}>
                        <RegionGeoChart data={regionGeoData} callback={CallBackRegionGeo} styles={styles} mapsApiKey={MAPAPIKEY} locationCd={locationCd}/>
                    </UI.Paper>
                </UI.Grid>
                <UI.Grid item xs={12} sm={6}>
                    <UI.Paper className={classes.paper}>
                        <PieChart data={devicePieData} obj={devicePie} styles={styles} filterColumnIndex='2' textLabel={t('device')}/>
                    </UI.Paper>
                </UI.Grid>
                <UI.Grid item xs={12} sm={6}>
                    <UI.Paper className={classes.paper}>
                        <PieChart data={genderPieData} styles={styles} filterColumnIndex='0' textLabel={t('gender')}/>
                    </UI.Paper>
                </UI.Grid>
            </UI.Grid>
        </div>
    )
}

export default Resycmi12m09