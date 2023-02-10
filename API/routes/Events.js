const express = require('express');
const router = express.Router();
const Events = require('../models/Events');
const dotenv = require('dotenv');
dotenv.config();

router.get('/all', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const events = await Events.find();
            res.json(events);
        } catch (err) {
            res.json({message: err})
        }
    }
    else
    {
        res.status(400).json({message: "Access Denied"});
    }
});

module.exports = router;