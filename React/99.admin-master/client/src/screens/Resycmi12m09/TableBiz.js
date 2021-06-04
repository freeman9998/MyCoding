import React from 'react'
import * as UI from '../../utils/material'
import { useTranslation } from 'react-i18next'

const TableBiz = ({data, callback, selectedBizList}) => {
    const { t } = useTranslation()

    const handleClick = (event, id) => {
        const selectedIndex = selectedBizList.indexOf(id)
        let newSelected = []
    
        if (selectedIndex === -1) {
            newSelected = newSelected.concat(selectedBizList, id)
        } else
        if (selectedIndex === 0) {
            newSelected = newSelected.concat(selectedBizList.slice(1))
        } else
        if (selectedIndex === selectedBizList.length - 1) {
            newSelected = newSelected.concat(selectedBizList.slice(0, -1))
        } else
        if (selectedIndex > 0) {
            newSelected = newSelected.concat(
                selectedBizList.slice(0, selectedIndex),
                selectedBizList.slice(selectedIndex + 1),
            )
        }

        callback(newSelected)
    }

    const handleSelectAllClick = (event) => {
        if (event.target.checked) {
            const newSelecteds = data && data.map((n) => n.biz_id)
            callback(newSelecteds)
            return
        }

        callback([])
    }

    const isSelected = (id) => {
        return selectedBizList.indexOf(id) !== -1
    }

    return (
        <UI.TableContainer style={{maxHeight : 250}}>
            <UI.Table size="small" stickyHeader>
                <UI.TableHead>
                    <UI.TableRow>
                        <UI.TableCell padding="checkbox">
                            <UI.Checkbox
                                indeterminate={data && selectedBizList.length > 0 && selectedBizList.length < data.length}
                                checked={(data && data.length > 0 && selectedBizList.length === data.length) || null}
                                onChange={handleSelectAllClick}
                            />
                        </UI.TableCell>
                        <UI.TableCell>{t('image')}</UI.TableCell>
                        <UI.TableCell>{t('company')}</UI.TableCell>
                        <UI.TableCell>{t('detect count')}</UI.TableCell>
                    </UI.TableRow>
                </UI.TableHead>
                <UI.TableBody>
                    {data && data.map((row, idx) => (
                        <UI.TableRow 
                            hover
                            role="checkbox"
                            onClick={(event) => handleClick(event, row.biz_id)}
                            aria-checked={isSelected(row.biz_id)}
                            tabIndex={-1}
                            selected={isSelected(row.biz_id)}
                            key={row.biz_id}
                        >
                            <UI.TableCell padding="checkbox">
                                <UI.Checkbox checked={isSelected(row.biz_id)}/>
                            </UI.TableCell>
                            <UI.TableCell>
                                <UI.Avatar
                                    variant="rounded"
                                    src={row.biz_logo_img_url}
                                >
                                    <UI.Typography variant="caption" display="block" gutterBottom>
                                        No Image
                                    </UI.Typography>
                                </UI.Avatar>
                            </UI.TableCell>
                            <UI.TableCell>{row.biz_name}</UI.TableCell>
                            <UI.TableCell>{row.detect_cnt}</UI.TableCell>
                        </UI.TableRow>
                    ))}
                </UI.TableBody>
            </UI.Table>
        </UI.TableContainer>
    )
}

export default TableBiz