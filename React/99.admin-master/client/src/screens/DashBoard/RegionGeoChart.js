import React from 'react'
import Chart from "react-google-charts"

const RegionGeoChart = ({data, callback, styles, mapsApiKey, locationCd}) => {

    const events = {
        eventName : "select",
        callback : ({chartWrapper}) => {

            const chart = chartWrapper.getChart()
            const selection = chart.getSelection()
            if (selection.length === 0) return
            const region = data[selection[0].row + 1]
            callback(region[0])
        }
    }

    if(Array.isArray(data)) {
        return (
            <Chart
                mapsApiKey  = {mapsApiKey}
                width       = {styles.width}
                height      = {styles.height}
                chartType   = "GeoChart"
                data        = {data}
                chartEvents = {[events]}
                options={{
                    // region: `${obj.params.location_cd}`,
                    region: `${locationCd}`,
                    displayMode: 'markers',
                    colorAxis: { colors: ['green', 'red'] },
                }}
                rootProps = {
                    { 'data-testid': '1' }
                }
            />
        )
    } else {
        return null
    }
}

export default RegionGeoChart