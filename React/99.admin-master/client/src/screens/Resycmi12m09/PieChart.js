import React from 'react'
import Chart from "react-google-charts"

const PieChart = ({data, styles, filterColumnIndex, textLabel}) => {

    if(Array.isArray(data)) {
        return (
            <Chart
                width={styles.width}
                height={styles.height}
                chartType="PieChart"
                data={data}
                rootProps={{ 'data-testid': '5' }}
                options={{
                    title: textLabel,
                    sliceVisibilityThreshold: 0.01,
                }}
                chartWrapperParams={{ view: { columns: [0, 1] } }}
                chartPackages={['corechart', 'controls']}
                controls={[{
                    controlEvents: [{
                        eventName: 'statechange',
                        callback: ({ chartWrapper, controlWrapper }) => {
                          // alert(
                          //   'State changed to ' + JSON.stringify(controlWrapper.getState()),
                          // )
                        },
                      },
                    ],
                    controlType: 'CategoryFilter',
                    options: {
                      filterColumnIndex: filterColumnIndex,
                      ui: {
                        labelStacking: 'vertical',
                        allowTyping: false,
                        allowMultiple: false,
                      },
                    },
                }]}
            />
        )
    } else {
        return null
    }
}

export default PieChart
