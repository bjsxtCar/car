function getFormData(formData)
{
    let object = {};
    formData.forEach
    (
        function(value, key)
        {
            if (key in object)
            {
                let curObj = object[key];
                if (curObj.prop && curObj.prop.constructor === Array)
                {
                    curObj.push(value);
                }
                else
                {
                    object[key] = new Array(curObj);
                    object[key].push(value);
                }
            }
            else
            {
                object[key] = value;
            }
        }
    );
    return object;
}