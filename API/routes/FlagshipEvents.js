const express = require('express');
const router = express.Router();
const FlagshipEvent = require('../models/FlagshipEvents');
const dotenv = require('dotenv');
dotenv.config(); 

router.get('/', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const flagships = await FlagshipEvent.find();
            res.json(flagships);
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